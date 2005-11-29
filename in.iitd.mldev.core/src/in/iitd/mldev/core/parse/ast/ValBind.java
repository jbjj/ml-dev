package in.iitd.mldev.core.parse.ast;

public class ValBind extends Bind {
	public Pat pat; public Exp exp;
	public boolean lazy = false;
    public ValBind (Pat p, Exp e) {pat = p; exp = e;}
    public ValBind (Pat p, Exp e, boolean l) {pat = p; exp = e; lazy = l;}
}
