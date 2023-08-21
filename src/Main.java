class Acquaintance {
    String name;

    Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus() {
        System.out.println(name + " is just an acquaintance.");
    }
}

class Friend extends Acquaintance {
    String homeTown;

    Friend(String name, String homeTown) {
        super(name);
        this.homeTown = homeTown;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is a friend and he is from " + homeTown + ".");
    }
}

class BestFriend extends Friend {
    String favoriteSong;

    BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is my best friend. He is from " + homeTown + " and his favorite song is " + favoriteSong + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(" ");
            String friendType = data[0];
            String friendName = data[1];
            String homeTown = "";
            String favoriteSong = "";

            if (data.length >= 3) {
                homeTown = data[2];
            }

            if (data.length >= 4) {
                favoriteSong = data[3];
            }

            if (friendType.equals("Acquaintance")) {
                Acquaintance acquaintance = new Acquaintance(friendName);
                acquaintance.getStatus();
            } else if (friendType.equals("Friend")) {
                Friend friend = new Friend(friendName, homeTown);
                friend.getStatus();
            } else if (friendType.equals("BestFriend")) {
                BestFriend bestFriend = new BestFriend(friendName, homeTown, favoriteSong);
                bestFriend.getStatus();
            }
        }
    }
}
