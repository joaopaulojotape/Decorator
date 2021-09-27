class CamisetaSporty extends CamisetaDecorator {
    public CamisetaSporty(Camiseta c) {
        super(c);
    }

    @Override
    public String assemble() {
        super.assemble();
        return "Camiseta Sporty";

    }
}