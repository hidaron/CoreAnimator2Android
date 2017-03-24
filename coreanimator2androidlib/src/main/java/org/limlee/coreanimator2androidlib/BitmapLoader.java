package org.limlee.coreanimator2androidlib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;

import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;

import okio.BufferedSource;
import okio.Okio;


final public class BitmapLoader {
    private WeakHashMap<String, Bitmap> mBitmapCaches = new WeakHashMap<>();
    private Context mContext;
    private String mImageDir;
    private int mInDensity = DisplayMetrics.DENSITY_XHIGH;

    /**
     * @param context
     * @param dir       资源所在目录名
     * @param inDensity 资源图片的密度
     */
    public BitmapLoader(Context context, String dir, int inDensity) {
        mContext = context;
        mImageDir = dir;
        mInDensity = inDensity;
    }

    public Bitmap load(String imageName) {
        Bitmap bitmap = mBitmapCaches.get(imageName);
        if (null == bitmap) {
            String framePath = String.format("%s/%s.png", mImageDir, imageName);
            BufferedSource bufferedSource = null;
            try {
                final InputStream bitmapInputStream = mContext.getAssets().open(framePath);
                bufferedSource = Okio.buffer(Okio.source(bitmapInputStream));
                final byte[] imagebytes = bufferedSource.readByteArray();
                if (null != imagebytes
                        && imagebytes.length > 0) {
                    bitmap = decodeBytes(imagebytes);
                    if (null != bitmap) {
                        mBitmapCaches.put(imageName, bitmap);
                    }
                }
            } catch (IOException e) {
                if (null != bufferedSource) {
                    try {
                        bufferedSource.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
        return bitmap;
    }

    private Bitmap decodeBytes(byte[] imageBytes) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = mInDensity;
        options.inTargetDensity = mContext.getResources().getDisplayMetrics().densityDpi;
        options.inScaled = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inSampleSize = 1;
        return BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length, options);
    }
}
