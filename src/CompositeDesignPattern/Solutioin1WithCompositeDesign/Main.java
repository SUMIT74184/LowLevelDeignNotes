package CompositeDesignPattern.Solutioin1WithCompositeDesign;

public class Main {
    public static void main(String args[]) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        File dhamaal=new File("Dhamaal");
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(dhamaal);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
    }
