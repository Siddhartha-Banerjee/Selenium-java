package testngtestui;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ListenerRetry implements IAnnotationTransformer
{
	public void transform(ITestAnnotation annotation,Class testclass,Constructor testConstructor)
	{
		annotation.setRetryAnalyzer(Retry.class);
	}
}
