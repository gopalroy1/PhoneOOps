public class Landline implements Phone{

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isIspowerOn() {
        return ispowerOn;
    }

    public void setIspowerOn(boolean ispowerOn) {
        this.ispowerOn = ispowerOn;
    }

    private String myPhoneNo;
    private boolean isRinging;
    private boolean ispowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.ispowerOn = true;
    }


    @Override
    public void powerOn() {
        this.ispowerOn= true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(ispowerOn==true){
            System.out.println("You are dialing the no : "+ phoneNo);
        }
        else{
            System.out.println("Your landline is off : ");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call aa rha hai");
            this.isRinging=false;

        }
        return true;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void reciveCall(String phoneNo) {
        if(ispowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("hey call rha rha hai "+myPhoneNo);
        }
        else{
            System.out.println("Power off hai bhai");
        }
    }
}
