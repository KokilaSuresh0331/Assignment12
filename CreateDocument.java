package assignment12;

abstract class Document {
    private String title;

    public Document(String title) {
        this.title = title;
    }

   
    public abstract String getDocumentType();

   
    public String getTitle() {
        return title;
    }

    
    public void printDetails() {
        System.out.println("Document Type: " + getDocumentType());
        System.out.println("Title: " + getTitle());
        printAdditionalDetails();
    }

    
    public abstract void printAdditionalDetails();
}

class PDFDocument extends Document {
    private int numberOfPages;

    public PDFDocument(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getDocumentType() {
        return "PDF Document";
    }

    @Override
    public void printAdditionalDetails() {
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

class TextDocument extends Document {
    private int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public String getDocumentType() {
        return "Text Document";
    }

    @Override
    public void printAdditionalDetails() {
        System.out.println("Word Count: " + wordCount);
    }
}

class ImageDocument extends Document {
    private int resolutionX;
    private int resolutionY;

    public ImageDocument(String title, int resolutionX, int resolutionY) {
        super(title);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String getDocumentType() {
        return "Image Document";
    }

    @Override
    public void printAdditionalDetails() {
        System.out.println("Resolution: " + resolutionX + "x" + resolutionY);
    }
}

public class CreateDocument {
    public static void main(String[] args) {
        
        PDFDocument pdfDocument = new PDFDocument("Book PDF", 10);
        TextDocument textDocument = new TextDocument("Notes Text", 500);
        ImageDocument imageDocument = new ImageDocument("LoadBalance Image", 1920, 1080);

        pdfDocument.printDetails();
        System.out.println();
        textDocument.printDetails();
        System.out.println();
        imageDocument.printDetails();
    }
}