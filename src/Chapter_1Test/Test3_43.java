package Chapter_1Test;

import java.io.File;

import edu.princeton.cs.algs4.StdOut;

public class Test3_43 {

	 
	/**
	 * @param args
	 */
	public static void listAllFiles(String path, int dep){
		File f = new File(path);
		File[] list = f.listFiles();
		for(File newFile:list){
			for(int i=0;i<dep;i++) StdOut.print("\t");
			StdOut.println(newFile.getName());
			if(newFile.isDirectory()){
				listAllFiles(newFile.getAbsolutePath(), dep+1);
			}
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\²âÊÔ";
		StdOut.println(path);
		listAllFiles(path, 0);
	}
}