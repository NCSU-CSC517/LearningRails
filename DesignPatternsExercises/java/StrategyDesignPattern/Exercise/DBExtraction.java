class DBExtraction implements Extraction {
    @Override
    public void extract() {
        __________(7)__________;
        System.out.println("DB Data type is getting extracted by reading rows and columns...");
        __________(8)__________;
    }

    @Override
    public void open() {
        System.out.println("Opening DB file...");
    }

    @Override
    public void close() {
        System.out.println("Closing DB file...");
    }
}
