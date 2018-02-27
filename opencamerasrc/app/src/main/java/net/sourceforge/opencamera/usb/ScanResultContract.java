package net.sourceforge.opencamera.usb;


import net.sourceforge.opencamera.usb.bean.CameraDevice;

import java.util.List;


public class ScanResultContract {
    public interface Presenter extends BasePresenter<ScanResultContract.View> {
        void loadCameraDevice();

        void downloadFirmware(List<CameraDevice> cameraDevicesList);

        void openCamera(CameraDevice cameraDevice);

        void clean();
    }

    public interface View extends BaseView {
    }
}
