package net.sourceforge.opencamera.usb;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.SurfaceHolder;

import net.sourceforge.opencamera.CameraController.CameraController;
import net.sourceforge.opencamera.CameraController.CameraControllerException;

import java.util.List;

/**
 * @author tx
 * @date 2018/3/5
 */
public class CameraController3 extends CameraController {


    CameraController3(int cameraId) {
        super(cameraId);
    }

    @Override
    public void release() {

    }

    @Override
    public void onError() {

    }

    @Override
    public String getAPI() {
        return null;
    }

    @Override
    public CameraFeatures getCameraFeatures() throws CameraControllerException {
        return null;
    }

    @Override
    public SupportedValues setSceneMode(String value) {
        return null;
    }

    @Override
    public String getSceneMode() {
        return null;
    }

    @Override
    public boolean sceneModeAffectsFunctionality() {
        return false;
    }

    @Override
    public SupportedValues setColorEffect(String value) {
        return null;
    }

    @Override
    public String getColorEffect() {
        return null;
    }

    @Override
    public SupportedValues setWhiteBalance(String value) {
        return null;
    }

    @Override
    public String getWhiteBalance() {
        return null;
    }

    @Override
    public boolean setWhiteBalanceTemperature(int temperature) {
        return false;
    }

    @Override
    public int getWhiteBalanceTemperature() {
        return 0;
    }

    @Override
    public SupportedValues setISO(String value) {
        return null;
    }

    @Override
    public void setManualISO(boolean manual_iso, int iso) {

    }

    @Override
    public boolean isManualISO() {
        return false;
    }

    @Override
    public boolean setISO(int iso) {
        return false;
    }

    @Override
    public String getISOKey() {
        return null;
    }

    @Override
    public int getISO() {
        return 0;
    }

    @Override
    public long getExposureTime() {
        return 0;
    }

    @Override
    public boolean setExposureTime(long exposure_time) {
        return false;
    }

    @Override
    public Size getPictureSize() {
        return null;
    }

    @Override
    public void setPictureSize(int width, int height) {

    }

    @Override
    public Size getPreviewSize() {
        return null;
    }

    @Override
    public void setPreviewSize(int width, int height) {

    }

    @Override
    public void setWantBurst(boolean want_burst) {

    }

    @Override
    public void setExpoBracketing(boolean want_expo_bracketing) {

    }

    @Override
    public void setExpoBracketingNImages(int n_images) {

    }

    @Override
    public void setExpoBracketingStops(double stops) {

    }

    @Override
    public void setUseExpoFastBurst(boolean use_expo_fast_burst) {

    }

    @Override
    public void setOptimiseAEForDRO(boolean optimise_ae_for_dro) {

    }

    @Override
    public void setRaw(boolean want_raw) {

    }

    @Override
    public void setVideoHighSpeed(boolean setVideoHighSpeed) {

    }

    @Override
    public void setVideoStabilization(boolean enabled) {

    }

    @Override
    public boolean getVideoStabilization() {
        return false;
    }

    @Override
    public int getJpegQuality() {
        return 0;
    }

    @Override
    public void setJpegQuality(int quality) {

    }

    @Override
    public int getZoom() {
        return 0;
    }

    @Override
    public void setZoom(int value) {

    }

    @Override
    public int getExposureCompensation() {
        return 0;
    }

    @Override
    public boolean setExposureCompensation(int new_exposure) {
        return false;
    }

    @Override
    public void setPreviewFpsRange(int min, int max) {

    }

    @Override
    public List<int[]> getSupportedPreviewFpsRange() {
        return null;
    }

    @Override
    public long getDefaultExposureTime() {
        return 0;
    }

    @Override
    public void setFocusValue(String focus_value) {

    }

    @Override
    public String getFocusValue() {
        return null;
    }

    @Override
    public float getFocusDistance() {
        return 0;
    }

    @Override
    public boolean setFocusDistance(float focus_distance) {
        return false;
    }

    @Override
    public void setFlashValue(String flash_value) {

    }

    @Override
    public String getFlashValue() {
        return null;
    }

    @Override
    public void setRecordingHint(boolean hint) {

    }

    @Override
    public void setAutoExposureLock(boolean enabled) {

    }

    @Override
    public boolean getAutoExposureLock() {
        return false;
    }

    @Override
    public void setRotation(int rotation) {

    }

    @Override
    public void setLocationInfo(Location location) {

    }

    @Override
    public void removeLocationInfo() {

    }

    @Override
    public void enableShutterSound(boolean enabled) {

    }

    @Override
    public boolean setFocusAndMeteringArea(List<Area> areas) {
        return false;
    }

    @Override
    public void clearFocusAndMetering() {

    }

    @Override
    public List<Area> getFocusAreas() {
        return null;
    }

    @Override
    public List<Area> getMeteringAreas() {
        return null;
    }

    @Override
    public boolean supportsAutoFocus() {
        return false;
    }

    @Override
    public boolean focusIsContinuous() {
        return false;
    }

    @Override
    public boolean focusIsVideo() {
        return false;
    }

    @Override
    public void reconnect() throws CameraControllerException {

    }

    @Override
    public void setPreviewDisplay(SurfaceHolder holder) throws CameraControllerException {

    }

    @Override
    public void setPreviewTexture(SurfaceTexture texture) throws CameraControllerException {

    }

    @Override
    public void startPreview() throws CameraControllerException {

    }

    @Override
    public void stopPreview() {

    }

    @Override
    public boolean startFaceDetection() {
        return false;
    }

    @Override
    public void setFaceDetectionListener(FaceDetectionListener listener) {

    }

    @Override
    public void autoFocus(AutoFocusCallback cb, boolean capture_follows_autofocus_hint) {

    }

    @Override
    public void setCaptureFollowAutofocusHint(boolean capture_follows_autofocus_hint) {

    }

    @Override
    public void cancelAutoFocus() {

    }

    @Override
    public void setContinuousFocusMoveCallback(ContinuousFocusMoveCallback cb) {

    }

    @Override
    public void takePicture(PictureCallback picture, ErrorCallback error) {

    }

    @Override
    public void setDisplayOrientation(int degrees) {

    }

    @Override
    public int getDisplayOrientation() {
        return 0;
    }

    @Override
    public int getCameraOrientation() {
        return 0;
    }

    @Override
    public boolean isFrontFacing() {
        return false;
    }

    @Override
    public void unlock() {

    }

    @Override
    public void initVideoRecorderPrePrepare(MediaRecorder video_recorder) {

    }

    @Override
    public void initVideoRecorderPostPrepare(MediaRecorder video_recorder) throws CameraControllerException {

    }

    @Override
    public String getParametersString() {
        return null;
    }
}
