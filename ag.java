package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ag.class */
public final class ag {
    private int[] a;
    private int b;
    private int c;
    private int d;
    private int e;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private float f13a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private float f14b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private float f15c;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private float f16d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    private float f17e;
    private float f;
    private float g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f18a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f19a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f20a;

    public ag() {
    }

    public ag(int[] r4, int r5, int r6, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, int r15) {
        this.f20a = null;
        this.a = r4;
        this.b = r5;
        this.f19a = z;
        this.f18a = r15;
        this.d = r6;
        this.e = 0;
        this.f13a = f;
        this.f14b = f2;
        this.f15c = f3;
        this.f17e = f4;
        this.f = f5;
        this.g = f6;
        this.f16d = f7;
        a(1);
    }

    public ag(String str, float f, float f2) {
        this.f20a = str;
        this.a = new int[]{0};
        this.f19a = false;
        this.f18a = -1;
        this.d = 800;
        this.e = 0;
        this.f13a = f;
        this.f14b = f2;
        this.f15c = 0.0f;
        this.f17e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.f16d = 0.0f;
        a(1);
    }

    public final boolean a(int r6) {
        int length;
        if (this.d >= 0) {
            this.e += r6;
            this.e = q.b(this.e, this.d);
            length = (this.a.length * this.e) / (this.d + 1);
        } else {
            length = 0;
        }
        this.c = length;
        this.f17e += (0.0f * r6) / 1000.0f;
        this.f += (this.f16d * r6) / 1000.0f;
        if (this.f17e != 0.0f || this.f != 0.0f) {
            this.f13a += (this.f17e * r6) / 1000.0f;
            this.f14b += (this.f * r6) / 1000.0f;
        }
        if (this.g != 0.0f) {
            this.f15c += (this.g * r6) / 1000.0f;
        }
        return this.d >= 0 && this.e >= this.d;
    }

    public final void a() {
        at.c();
        at.a(this.f13a, this.f14b);
        at.a(this.f15c);
        at.b(0.125f);
        if (this.f20a != null) {
            at.a((-0.5f) * au.a(4, this.f20a), (-0.5f) * au.m46c(4));
            au.m47a(4, this.f20a, 0, 0);
        } else {
            at.a(this.b);
            int r0 = this.a[this.c];
            if (r0 > 0) {
                at.a((-0.5f) * au.m43a(r0), (-0.5f) * au.m44b(r0));
                at.c(r0);
            }
        }
        at.d();
    }
}
