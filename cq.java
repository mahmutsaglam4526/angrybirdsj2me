package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cq.class */
public final class cq {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public short[] f183a = new short[f192f];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float[] f184a = new float[f192f];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public float[] f185b = new float[f192f];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f186a = 0;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public short[] f187b = new short[f193g];

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public float[] f188c = new float[f193g];

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public float[] f189d = new float[f193g];

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public float[] f190e = new float[f193g];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f191b = 0;

    /* JADX INFO: renamed from: f, reason: collision with other field name */
    private static int f192f = 10;

    /* JADX INFO: renamed from: g, reason: collision with other field name */
    private static int f193g = 250;

    /* JADX INFO: renamed from: h, reason: collision with other field name */
    private static int f194h = 40;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public static int f195c = (f192f + f193g) + f194h;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    public int f196d;

    /* JADX INFO: renamed from: e, reason: collision with other field name */
    public int f197e;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;

    public final void a(short s, float f, float f2) {
        if (this.f186a >= f192f) {
            return;
        }
        if (this.f186a == 0) {
            this.g = f;
            this.h = f2 - 8.5f;
        }
        this.f183a[this.f186a] = s;
        this.f184a[this.f186a] = f;
        this.f185b[this.f186a] = f2;
        this.f186a++;
    }

    public final void a(short s, float f, float f2, float f3) {
        if (this.f191b >= f193g) {
            return;
        }
        this.f187b[this.f191b] = s;
        this.f188c[this.f191b] = f;
        this.f189d[this.f191b] = f2;
        this.f190e[this.f191b] = f3;
        this.f191b++;
    }

    public final void a() {
        l lVar = new l(this.f191b);
        int r8 = 0;
        for (int r10 = 0; r10 < this.f191b; r10++) {
            int r0 = cx.m133a(this.f187b[r10]);
            boolean z = false;
            int r12 = 0;
            while (!z) {
                boolean z2 = r12 >= lVar.a - 1;
                if (lVar.a > 0) {
                    r8 = cx.m133a(this.f187b[lVar.f421a[r12]]);
                }
                if (lVar.a > 0 && r0 < r8) {
                    lVar.a(r12, r10);
                    z = true;
                } else if (z2) {
                    lVar.a(r10);
                    z = true;
                }
                r12++;
            }
        }
        short[] sArr = new short[this.f187b.length];
        float[] fArr = new float[this.f188c.length];
        float[] fArr2 = new float[this.f189d.length];
        float[] fArr3 = new float[this.f190e.length];
        for (int r9 = 0; r9 < lVar.a; r9++) {
            int r1 = lVar.f421a[r9];
            sArr[r9] = this.f187b[r1];
            fArr[r9] = this.f188c[r1];
            fArr2[r9] = this.f189d[r1];
            fArr3[r9] = this.f190e[r1];
        }
        this.f187b = sArr;
        this.f188c = fArr;
        this.f189d = fArr2;
        this.f190e = fArr3;
    }

    public final void b() {
        this.i = (this.d - ((ac.a / 2) / (8.0f * this.f))) - 5.0f;
        this.j = this.a + ((ac.a / 2) / (8.0f * this.c)) + 5.0f;
        this.m = (ac.a / 8.0f) / (this.j - this.i);
        this.m = Math.max(0.25f, this.m);
        this.k = this.i - 5.0f;
        this.l = this.j + 5.0f;
        for (int r7 = 0; r7 < this.f191b; r7++) {
            this.k = Math.min(this.k, this.f188c[r7] - 5.0f);
            this.l = Math.max(this.l, this.f188c[r7] + 5.0f);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final int m114a() {
        if (this.f196d <= 0) {
            this.f196d = 40000;
        }
        return this.f196d;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final int m115b() {
        if (this.f197e <= 0) {
            this.f197e = 60000;
        }
        return this.f197e;
    }
}
