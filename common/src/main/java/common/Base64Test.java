package common;

public class Base64Test {

    public static String fileString = "";
    public static void main(String[] args) {
//        fileToBase64();
//        try {
//            Base64Utils.toFile(fileString,"D:\\test\\1.txt");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        base64ToFile();
    }


    public static void fileToBase64() {
        // 文件转成Base64字符串
        String a = "";
        try {
            fileString = Base64Utils.encodeBase64File("D:\\test\\ejjzszyzgzs_AAAE5E6B595242ECB5DA720A20452D73.ofd");
        } catch (Exception e) {

        }

        System.out.println(fileString);
    }

//    public static void base64ToFile() {
//        String s = "";
//        try {
//            s = Base64Utils.decoderBase64File(c, "D:\\test\\1.ofd");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println(s);
//    }
}