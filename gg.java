package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:gg.class */
public final class gg {
    public final ap[] a = new ap[8];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f411a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f412a;

    public gg() {
        for (int r6 = 0; r6 < this.a.length; r6++) {
            this.a[r6] = new ap();
        }
        this.f411a = 0;
        this.f412a = 0.0f;
    }

    public final void a(eo eoVar) {
        switch (eoVar.b) {
            case 0:
                el elVar = (el) eoVar;
                this.a[0].m22a(elVar.a);
                this.f411a = 1;
                this.f412a = ((eo) elVar).a;
                break;
            case 1:
                en enVar = (en) eoVar;
                this.f411a = enVar.f323a;
                this.f412a = ((eo) enVar).a;
                for (int r6 = 0; r6 < this.f411a; r6++) {
                    this.a[r6].m22a(enVar.f322a[r6]);
                }
                break;
        }
    }

    public final int a(ap apVar) {
        int r5 = 0;
        float fM31a = ap.m31a(this.a[0], apVar);
        for (int r7 = 1; r7 < this.f411a; r7++) {
            float fM31a2 = ap.m31a(this.a[r7], apVar);
            if (fM31a2 > fM31a) {
                r5 = r7;
                fM31a = fM31a2;
            }
        }
        return r5;
    }

    public final ap a(int r4) {
        return this.a[r4];
    }
}
