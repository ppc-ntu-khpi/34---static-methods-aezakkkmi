    package domain;
/**
 * @see
 * @author God
 */
public class Exercise {
/**
 * Це шифратор, який шифрує потрібний текст.
 * @param text це -  заданий текст користувачем.
 * @param keyWord це - KeyWord ключ.
 * @return result
 */
    public static byte[] encrypt(String text, String keyWord)
{
    byte[] arr = text.getBytes();
    byte[] keyarr = keyWord.getBytes();
    byte[] result = new byte[arr.length];
    for(int i = 0; i< arr.length; i++)
    {
        result[i] = (byte) (arr[i] ^ keyarr[i % keyarr.length]);
    }
    return result;
}
}