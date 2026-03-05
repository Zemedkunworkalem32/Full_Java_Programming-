class Phone {
  
  public void call() {
    System.out.println("phone is calling...");
  }

  public void sms() {
    System.out.println("phone is sending sms...");
  }
}

interface Camera {
  void clickPhoto();
  void recordVideo();
}

interface MusicPlayer {
  void playMusic();
  void stopMusic();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {

  @Override
  public void clickPhoto() {
    System.out.println("Smartphone is clicking photo...");
  }

  @Override
  public void recordVideo() {
    System.out.println("Smartphone is recording video...");
  }

  @Override
  public void playMusic() {
    System.out.println("Smartphone is playing music...");
  }

  @Override
  public void stopMusic() {
    System.out.println("Smartphone has stopped music...");
  }
}
public class Phones {
  public static void main(String[] args) {
    SmartPhone myPhone = new SmartPhone();
    myPhone.call();
    myPhone.sms();
    myPhone.clickPhoto();
    myPhone.recordVideo();
    myPhone.playMusic();
    myPhone.stopMusic();
  }
}
