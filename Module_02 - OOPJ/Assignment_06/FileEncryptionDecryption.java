import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class FileEncryptionDecryption implements Serializable {

	public static void main(String[] args) {
		encrypt(4);
		decrypt(4);
	}
	
	public static void decrypt(int offset) {
		String pathName="E:\\# AC_COURSE (C-DAC)\\MODULE_02 - OOP\\ASSIGNMENT\\A6\\src\\Data_enc.txt";
		String decPathName="E:\\# AC_COURSE (C-DAC)\\MODULE_02 - OOP\\ASSIGNMENT\\A6\\src\\Data_dec.txt";

		File file=new File(pathName);
		File encFile=new File(decPathName);
		
		try(FileInputStream fis=new FileInputStream(pathName);FileOutputStream fos=new FileOutputStream(decPathName)){
			byte[] buf=new byte[1024];
			
			int n;
			
			while((n=fis.read(buf))!=-1) {
				for(int i=0;i<n ;i++) {
					buf[i]=(byte) (buf[i]-offset);
				}
				fos.write(buf);
			}
			System.out.println("File Decrypted...");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void encrypt(int offset) {

		String pathName="E:\\# AC_COURSE (C-DAC)\\MODULE_02 - OOP\\ASSIGNMENT\\A6\\src\\Data.txt";
		String encPathName="E:\\# AC_COURSE (C-DAC)\\MODULE_02 - OOP\\ASSIGNMENT\\A6\\src\\Data_enc.txt";

		File file=new File(pathName);
		File encFile=new File(encPathName);
		try(FileOutputStream fos=new FileOutputStream(encFile);FileInputStream fis=new FileInputStream(file)){
			byte[] buf=new byte[1024];
			
			int n;
			
			while((n=fis.read(buf))!=-1) {
				for(int i=0;i<n;i++) {
					buf[i]=(byte) (buf[i]+offset);
				}
				
				fos.write(buf, 0, n);;
			}
			System.out.println("File Encrypted...");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
