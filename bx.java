package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bx.class */
public abstract class bx extends bv {
    private x b = new x();

    @Override // defpackage.bv, defpackage.bo
    public final void c() {
        super.c();
        this.b.a();
    }

    protected final int[] a() {
        int[] r0 = a(b());
        ab.a(r0, 0);
        return r0;
    }

    protected final int[] a(int r8) {
        int[] r9;
        if (this.b.a <= r8) {
            r9 = new int[8];
            x xVar = this.b;
            if (xVar.a == xVar.f430a.length) {
                Object[] objArr = new Object[xVar.a << 1];
                az.a(xVar.f430a, 0, objArr, 0, xVar.a);
                xVar.f430a = objArr;
            }
            az.a(xVar.f430a, r8, xVar.f430a, r8 + 1, xVar.a - r8);
            xVar.a++;
            xVar.f430a[r8] = r9;
        } else {
            r9 = (int[]) this.b.a(r8);
        }
        return r9;
    }
}
