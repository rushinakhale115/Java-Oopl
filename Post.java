public class Post {
    public void posting() {
        System.out.println("Your post is posted.");
    }

    public void commenting() {
        System.out.println("Enter your comment:");
    }

    public static class TextPost extends Post {
        @Override
        public void posting() {

            System.out.println("Post is of text type.");
        }

        @Override
        public void commenting() {

            System.out.println("Comment is of text type.");
        }
    }

    public static class ImagePost extends Post {
        @Override
        public void posting() {

            System.out.println("Your post is of image type.");
        }

        @Override
        public void commenting() {

            System.out.println("Your comment is of image type.");
        }
    }

    public static void main(String[] args) {
        TextPost t1 = new TextPost();
        ImagePost i1 = new ImagePost();

        System.out.println("Text Post:");
        t1.commenting();
        t1.posting();

        System.out.println("\nImage Post:");
        i1.commenting();
        i1.posting();
    }
}
