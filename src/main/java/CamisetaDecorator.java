class CamisetaDecorator implements Camiseta {
    protected Camiseta camiseta;

    public CamisetaDecorator(Camiseta c) {
        this.camiseta = c;
    }

    @Override
    public String assemble() {

        this.camiseta.assemble();

        return null;
    }
}