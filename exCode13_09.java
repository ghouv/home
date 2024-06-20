import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class exCode13_09 {
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }
	public static void main(String[] args) {
		String fileName = "c:/photo/picture84.jpg";		
		Mat inImage = Imgcodecs.imread(fileName, Imgcodecs.IMREAD_COLOR);
		Mat outImage = new Mat();

		Imgproc.Canny(inImage, outImage, 100, 100*3);

		HighGui.imshow("원본 이미지", inImage);
		HighGui.imshow("결과 이미지", outImage);
		HighGui.waitKey(0);	
		System.exit(0);;
	}
}