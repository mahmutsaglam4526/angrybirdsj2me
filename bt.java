package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bt.class */
public class bt extends bm {
    public int c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public boolean f140c;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private int[] f139c = new int[2];
    private int d = 5;

    public final void e() {
        this.c = 66;
    }

    @Override // defpackage.bo
    public final void a(bo boVar) {
    }

    @Override // defpackage.bo
    /* JADX INFO: renamed from: a */
    public final int mo92a(int r4, int r5) {
        if (((bm) this).a && this.c != 0 && r4 == 48 && r5 == this.d) {
            return this.c;
        }
        return 0;
    }

    @Override // defpackage.bo
    public int a(int r6, int r7, int r8) {
        if (!((bm) this).a || this.c == 0) {
            return 0;
        }
        boolean zA = ah.a(((bo) this).b, r7, r8, ((bm) this).f127a);
        if (r6 == 64 && zA) {
            this.f140c = true;
            this.f139c[0] = r7;
            this.f139c[1] = r8;
        } else {
            if (r6 == 65 && this.f140c) {
                this.f140c = false;
                return this.c;
            }
            if (r6 == 67 && q.f(this.f139c[0] - r7, this.f139c[1] - r8) > 400) {
                this.f140c = false;
            }
        }
        return this.f140c ? 1 : 0;
    }
}
