import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
      /*int a = 10;
      int b = 3;
      int c = 88;
        HashMap <String,Integer> happy = new HashMap<String,Integer>();
        happy.put("a",10);
        happy.put("b", 3);
        happy.put("c",88);

        //printing out the HashMap
        System.out.println(happy);

        //Printing out value of c
        System.out.println(happy.get("c"));
    }*/
        // username,password
        HashMap<String,String> fun = new HashMap<String,String>();
        fun.put("Aqil","password1");
        fun.put("helloKitty","wolfwolf");
        fun.put("coolguy123","hello");

        System.out.println(fun);

        System.out.println(fun.get("Aqil"));
        System.out.println(fun.containsKey("Aqil"));

        for(String x : fun.keySet()){
            System.out.println(x + "=" + fun.get(x));
            // System.out.println(fun.get(x));
        }
        String [] name = new String[2];
        name[0] = "Aqil";
        name[1] = "Ali";
        // name[3] = "alss";
        System.out.println(name[1]);

    }
}

