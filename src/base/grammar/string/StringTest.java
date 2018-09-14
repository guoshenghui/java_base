package base.grammar.string;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;

public class StringTest {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String a = "chenssy";
		System.out.println("a=" + a);
		Field a_ = String.class.getDeclaredField("value");
		a_.setAccessible(true);
		char[] value = (char[]) a_.get(a);
		value[4] = '_';
		System.out.println("a=" + a);
		System.out.println("java补空格:" + String.format("%1$-35s", "a"));
		String sourceString = "sourceString"; // 待写入字符串
		byte[] sourceByte = sourceString.getBytes();
		if (null != sourceByte) {
			try {
				File file = new File("D:\\2.txt"); // 文件路径（路径+文件名）
				if (!file.exists()) { // 文件不存在则创建文件，先创建目录
					File dir = new File(file.getParent());
					dir.mkdirs();
					file.createNewFile();
				}
				FileOutputStream outStream = new FileOutputStream(file); // 文件输出流用于将数据写入文件
				outStream.write(sourceByte);
				outStream.close(); // 关闭文件输出流
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
