package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dq.class */
public final class dq extends dn {
    public dq() {
        super(12, 68);
        dn.a((dn) this);
    }

    @Override // defpackage.bu, defpackage.bo
    public final void b(int r6, int r7) {
        super.b(r6, r7);
        if (ce.a) {
            return;
        }
        a(bm.a_, r6, r7);
        au.a(13, bm.a_[0], bm.a_[1]);
    }

    @Override // defpackage.dn, defpackage.bt, defpackage.bo
    public final int a(int r6, int r7, int r8) {
        int r0 = super.a(r6, r7, r8);
        if (r0 == ((bt) this).c) {
            boolean z = !ce.a;
            ce.a = z;
            if (!z) {
                di.d();
            }
            ce.a();
            if (ce.a) {
                dn.b(3);
                if (((a) cf.a.m3a()).a == 2) {
                    di.c();
                }
            } else {
                di.d();
                db.c();
            }
        }
        return r0;
    }
}
