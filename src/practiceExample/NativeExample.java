package practiceExample;

public class NativeExample {

	static
	{
		System.loadLibrary("Native labrary path");
	}
	public native void m();
}
