public interface Phone {
    void powerOn();
    void callNumber(String phoneNo);
    boolean answerCall();
    boolean isRinging();
    void reciveCall(String phoneNo);

}
