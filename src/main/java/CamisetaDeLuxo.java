class CamisetaDeLuxo extends CamisetaDecorator {
    public CamisetaDeLuxo(Camiseta c) {
        super(c);
    }

    @Override
    public String assemble() {
        super.assemble();
        return"Camiseta luxo";

    }
}