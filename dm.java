package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dm.class */
public final class dm extends dn {
    private final int d;
    private final int e;
    private final int f;
    private int g;

    public dm(int r6, int r7, int r8) {
        super(209, r8 < 15 ? r8 + 100 : 0);
        this.d = r6;
        this.e = r8;
        this.f = r7;
        this.g += de.a(this.f) + r8;
        dn.a((dn) this);
    }

    @Override // defpackage.bu, defpackage.bo
    public final void b(int r7, int r8) {
        if (this.g >= 15) {
            au.m49a();
            return;
        }
        boolean zA = cd.a(this.g);
        a(zA ? this.d : 209);
        super.b(r7, r8);
        if (zA) {
            a(bm.a_, r7, r8);
            bm.a_[3] = 33;
            String string = Integer.toString(this.e + 1);
            int[] r1 = bm.a_;
            au.m47a(2, string, 0 + r1[0] + aa.a(r1[2], au.a(2, string), 32768), 0 + r1[1] + aa.a(r1[3], au.m46c(2), 32768));
            int r0 = cd.m99a(this.g);
            if (r0 > 0) {
                a(bm.a_, r7, r8);
                int[] r2 = bm.a_;
                r2[1] = r2[1] + (bm.a_[3] - 7);
                bm.a_[3] = 7;
                aa.a(210 + (r0 - 1), bm.a_);
            }
        }
    }
}
