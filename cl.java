package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cl.class */
public final class cl extends cb {
    private int b;
    private int c;
    private int[] a;

    public cl() {
        super(1);
        this.a = new int[4];
    }

    @Override // defpackage.cb
    public final void b(int r4) {
        ((cb) this).a.c(4);
        ((cb) this).a.c(3);
        ci.a(((cb) this).a);
        if (ce.b) {
            ((cb) this).a.c(23);
        }
    }

    @Override // defpackage.cb
    public final void a(int r2, int r3, int r4) {
    }

    @Override // defpackage.cb
    public final void e() {
        this.b += 20;
        if (this.b > 3000) {
            int r1 = this.c + 1;
            this.c = r1;
            if (r1 > 1) {
                if (ce.b) {
                    ((cb) this).a.b(13);
                } else {
                    ((cb) this).a.b(2);
                }
                ce.b = true;
                ce.a();
            }
            this.b = 0;
        }
    }

    @Override // defpackage.cb
    public final void f() {
        if (this.c == 0) {
            au.c(-1);
        }
        this.a[2] = ac.a;
        this.a[3] = ac.b;
        aa.a(226 + this.c, this.a);
    }
}
