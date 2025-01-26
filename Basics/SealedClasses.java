package Java.Basics;
sealed class A permits B,C{

}

final class B extends A{

}

final class C extends A{

}


sealed interface X permits Y,Z{

    
}

non-sealed interface Y extends X{

}

non-sealed interface Z extends X{

}


public class SealedClasses {
    public static void main(String arg[]){

    }
}
