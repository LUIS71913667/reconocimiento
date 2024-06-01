package com.example.reconocimiento;

import android.view.SurfaceHolder;

public class CameraSource {
    public CameraSource(MainActivity mainActivity, SurfaceHolder holder) {
    }

    public void takePicture(CameraSource.PictureCallback pictureCallback) {
    }

    public void start() {
    }

    public void release() {
    }

    public interface PictureCallback {
        void onPictureTaken(byte[] data);
    }
}
