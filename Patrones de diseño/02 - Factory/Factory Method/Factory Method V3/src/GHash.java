import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

public class GHash extends AlgoritmoEncriptamiento {
	private static String secretKey = "GHash!!!!";
	private static String salt = "GHash!!!!";
	private byte[] gHashInitVector = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private IvParameterSpec gHashInitVectorHash = new IvParameterSpec(gHashInitVector);

	@Override
	public void configurar() {
		String secretKey = "GHash!!!!";
		String salt = "GHash!!!!";
		IvParameterSpec gHashInitVectorHash = new IvParameterSpec(gHashInitVector);
	}

	@Override
	public String encriptar(String str) {
		System.out.println("Encrypting String with GHash");
		try {
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), 65536, 256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, gHashInitVectorHash);
			return Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes("UTF-8")));
		} catch (Exception e) {
			System.out.println("Error while encrypting with GHash: " + e.toString());
		}
		return null;
	}

	@Override
	public String desencriptar(String str) {
		System.out.println("Decrypting String with GHash");
		try {
			SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), salt.getBytes(), 65536, 256);
			SecretKey tmp = factory.generateSecret(spec);
			SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKey, gHashInitVectorHash);
			return new String(cipher.doFinal(Base64.getDecoder().decode(str)));
		} catch (Exception e) {
			System.out.println("Error while decrypting: " + e.toString());
		}
		return null;
	}
}