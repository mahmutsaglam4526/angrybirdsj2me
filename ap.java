package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ap.class */
public final class ap {
    private static final w a = new w();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f60a;
    public float b;

    public static ap a() {
        ap apVar = (ap) a.a();
        ap apVar2 = apVar;
        if (apVar == null) {
            apVar2 = new ap();
            a.a(apVar2);
        }
        return apVar2;
    }

    public static void a(int r3) {
        a.a(r3);
    }

    public ap() {
    }

    public ap(float f, float f2) {
        this.f60a = f;
        this.b = f2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m21a() {
        this.f60a = 0.0f;
        this.b = 0.0f;
    }

    public final void a(float f, float f2) {
        this.f60a = f;
        this.b = f2;
    }

    public final ap a(float f) {
        this.f60a = f;
        this.b = 0.0f;
        return this;
    }

    public final void a(ap apVar) {
        this.f60a = apVar.f60a;
        this.b = apVar.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final ap m22a(ap apVar) {
        this.f60a = apVar.f60a;
        this.b = apVar.b;
        return this;
    }

    public final void b() {
        this.f60a = -this.f60a;
        this.b = -this.b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final ap m23b() {
        this.f60a = -this.f60a;
        this.b = -this.b;
        return this;
    }

    public final void b(ap apVar) {
        this.f60a += apVar.f60a;
        this.b += apVar.b;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final ap m24b(ap apVar) {
        this.f60a += apVar.f60a;
        this.b += apVar.b;
        return this;
    }

    public final void a(ap apVar, ap apVar2) {
        this.f60a = apVar.f60a + apVar2.f60a;
        this.b = apVar.b + apVar2.b;
    }

    public final void c(ap apVar) {
        this.f60a -= apVar.f60a;
        this.b -= apVar.b;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final ap m25c(ap apVar) {
        this.f60a -= apVar.f60a;
        this.b -= apVar.b;
        return this;
    }

    public final void b(ap apVar, ap apVar2) {
        this.f60a = apVar.f60a - apVar2.f60a;
        this.b = apVar.b - apVar2.b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m26a(float f) {
        this.f60a *= f;
        this.b *= f;
    }

    public final void a(ap apVar, float f) {
        this.f60a = apVar.f60a * f;
        this.b = apVar.b * f;
    }

    public final ap b(float f) {
        this.f60a *= f;
        this.b *= f;
        return this;
    }

    public final void c() {
        this.f60a = this.f60a > 0.0f ? this.f60a : -this.f60a;
        this.b = this.b > 0.0f ? this.b : -this.b;
    }

    public final void b(ap apVar, float f) {
        float f2 = (-f) * apVar.f60a;
        this.f60a = f * apVar.b;
        this.b = f2;
    }

    public final void a(float f, ap apVar) {
        float f2 = f * apVar.f60a;
        this.f60a = (-f) * apVar.b;
        this.b = f2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final float m27a() {
        float fM29c = m29c();
        this.f60a /= fM29c;
        this.b /= fM29c;
        return fM29c;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public final float m28b() {
        return (this.f60a * this.f60a) + (this.b * this.b);
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public final float m29c() {
        return (float) Math.sqrt((this.f60a * this.f60a) + (this.b * this.b));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final float m30a(ap apVar) {
        return (this.f60a * apVar.b) - (this.b * apVar.f60a);
    }

    public final void c(ap apVar, ap apVar2) {
        this.f60a = Math.min(apVar.f60a, apVar2.f60a);
        this.b = Math.min(apVar.b, apVar2.b);
    }

    public final void d(ap apVar, ap apVar2) {
        this.f60a = Math.max(apVar.f60a, apVar2.f60a);
        this.b = Math.max(apVar.b, apVar2.b);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(this.f60a);
        stringBuffer.append(", ");
        stringBuffer.append(this.b);
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static float m31a(ap apVar, ap apVar2) {
        return (apVar.f60a * apVar2.f60a) + (apVar.b * apVar2.b);
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static float m32b(ap apVar, ap apVar2) {
        return (apVar.f60a * apVar2.b) - (apVar.b * apVar2.f60a);
    }
}
