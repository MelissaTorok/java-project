public class InputDevice {

    static void getType() {
        System.out.println("random");
    }

    static int nextIN() {
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        //System.out.println(randomNum);
        return randomNum;
    }
}