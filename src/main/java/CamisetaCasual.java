class CamisetaCasual extends CamisetaDecorator {
    public CamisetaCasual(Camiseta c) {
        super(c);
    }

    @Override
    public String assemble() {
        super.assemble();
        return "Camiseta Casual";

    }
}