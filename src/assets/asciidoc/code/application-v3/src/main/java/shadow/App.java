package shadow;

import shadow.client.Version;

public class App {
  public static void main(String[] args) {
    System.out.println(AdapterVersion.getVersion());
    System.out.println(Version.getVersion());
  }
}
