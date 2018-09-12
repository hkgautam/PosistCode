
 public class EncryptUtils {
    public static final String DEFAULT_ENCODING = "UTF-8"; 
    static BASE64Encoder enc = new BASE64Encoder();
    static BASE64Decoder dec = new BASE64Decoder();

    public static String base64encode(String text) {
        try {
            return enc.encode(text.getBytes(DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }//base64encode

    public static String base64decode(String text) {
        try {
            return new String(dec.decodeBuffer(text), DEFAULT_ENCODING);
        } catch (IOException e) {
            return null;
        }
    }//base64decode

    public static String encryptData(String ownerId,Float value,String ownerName,String hash) {

        System.out.println(ownerName + " XOR-ed to: " + (ownerName = xorMessage(ownerName, ownerId)));

        String encoded = base64encode(ownerName)+base64encode(ownerId)base64encode(value)base64encode(hash);


        // System.out.println(" is encoded to: " + encoded + " and that is decoding to: " + (data = base64decode(encoded)));
        // System.out.print("XOR-ing back to original: " + xorMessage(ownerName, ownerid));
    
    return encoded;

    }

    public static String xorMessage(String message, String key) {
        try {
            if (message == null || key == null) return null;

            char[] keys = key.toCharArray();
            char[] mesg = message.toCharArray();

            int ml = mesg.length;
            int kl = keys.length;
            char[] newmsg = new char[ml];

            for (int i = 0; i < ml; i++) {
                newmsg[i] = (char)(mesg[i] ^ keys[i % kl]);
            }//for i

            return new String(newmsg);
        } catch (Exception e) {
            return null;
        }
    }//xorMessage
}//class
