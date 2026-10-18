package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:cy.class */
public final class cy {
    public ap[] a;
    private static int c = -1;
    public static int b = 1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f236a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public float f237b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    public float f238c;
    private float d = -1.0f;
    private float e = -1.0f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f235a = c;

    public final float a() {
        if (this.e > 0.0f) {
            return this.e;
        }
        if (this.f235a == b) {
            this.e = 3.1415927f * this.f236a * this.f236a;
        } else if (this.f235a == 0) {
            float fMin = 0.0f;
            float fMax = 0.0f;
            float fMin2 = 0.0f;
            float fMax2 = 0.0f;
            for (int r11 = 0; r11 < this.a.length; r11++) {
                fMin = Math.min(fMin, this.a[r11].f60a);
                fMax = Math.max(fMax, this.a[r11].f60a);
                fMin2 = Math.min(fMin2, this.a[r11].b);
                fMax2 = Math.max(fMax2, this.a[r11].b);
            }
            this.e = (fMax - fMin) * (fMax2 - fMin2);
            if (this.a.length == 3) {
                this.e = (float) (((double) this.e) * 0.5d);
            } else if (this.a.length > 4) {
                this.e = (float) (((double) this.e) * 0.8d);
            }
        }
        return this.e;
    }

    public final float b() {
        if (this.d <= 0.0f) {
            if (this.d <= 0.0f) {
                if (this.f235a == b) {
                    this.d = 1.0f;
                } else if (this.f235a == 0) {
                    float fMin = 0.0f;
                    float fMax = 0.0f;
                    float fMin2 = 0.0f;
                    float fMax2 = 0.0f;
                    for (int r12 = 0; r12 < this.a.length; r12++) {
                        fMin = Math.min(fMin, this.a[r12].f60a);
                        fMax = Math.max(fMax, this.a[r12].f60a);
                        fMin2 = Math.min(fMin2, this.a[r12].b);
                        fMax2 = Math.max(fMax2, this.a[r12].b);
                    }
                    this.d = (fMax - fMin) / (fMax2 - fMin2);
                    if (this.d < 1.0f) {
                        this.d = 1.0f / this.d;
                    }
                }
            }
            float f = this.d;
        }
        return 1.0f - ((0.5f * Math.min(10.0f, this.d - 1.0f)) / 10.0f);
    }
}
