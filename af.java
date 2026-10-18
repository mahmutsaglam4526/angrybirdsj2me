package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:af.class */
public final class af {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f12a;

    public af() {
    }

    public af(int r4, float f, float f2) {
        this.f12a = r4;
        this.a = f;
        this.b = f2;
        this.g = 0.0f;
        if (this.f12a == 0) {
            this.c = 10.0f;
            this.e = 7.5f;
            this.d = 500.0f;
            float f3 = this.d;
            float f4 = this.c;
            this.f = 600.0f;
            float f5 = this.f;
            float f6 = this.e;
            return;
        }
        if (this.f12a == 1) {
            this.c = 15.0f;
            this.e = 5.0f;
            this.d = 1750.0f;
            float f7 = this.d;
            float f8 = this.c;
            this.f = 300.0f;
            float f9 = this.f;
            float f10 = this.e;
            return;
        }
        if (this.f12a == 2) {
            this.c = 10.0f;
            this.e = 5.0f;
            this.d = 1500.0f;
            float f11 = this.d;
            float f12 = this.c;
            this.f = 150.0f;
            float f13 = this.f;
            float f14 = this.e;
        }
    }
}
