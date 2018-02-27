package net.sourceforge.opencamera.usb.asynctask;

import android.content.Context;
import android.os.AsyncTask;

import net.sourceforge.opencamera.usb.bean.CameraDevice;
import net.sourceforge.opencamera.usb.bean.CameraHandler;
import net.sourceforge.opencamera.usb.helper.CameraDeviceHelper;
import net.sourceforge.opencamera.usb.helper.EventEmitter;

public class OpenCameraTask extends AsyncTask<CameraDevice, Integer, CameraHandler> {
    private static final String TAG = "OpenCameraTask";
    private Context context;

    public OpenCameraTask(Context context) {
        this.context = context;
    }

    @Override
    protected CameraHandler doInBackground(CameraDevice... cameraDevices) {
        try{
            Thread.sleep(1000);
        }catch (Exception e){}

        CameraHandler cameraHandler = null;
        if( cameraDevices.length > 0 && cameraDevices[0] != null ){
            cameraHandler = CameraDeviceHelper.openCamera(context,cameraDevices[0]);
        }
        return cameraHandler;
    }

    @Override
    protected void onPostExecute(CameraHandler cameraHandler) {
        EventEmitter.emitCameraOpenMessageEvent(cameraHandler);
    }



}
