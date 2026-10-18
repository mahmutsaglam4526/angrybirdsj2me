package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:al.class */
public final class al {
    public ap a = new ap();
    public ap b = new ap();

    public final void a(float f) {
        float fCos = (float) Math.cos(f);
        float fSin = (float) Math.sin(f);
        this.a.f60a = fCos;
        this.b.f60a = -fSin;
        this.a.b = fSin;
        this.b.b = fCos;
    }

    public final void a() {
        float f = this.a.f60a;
        float f2 = this.b.f60a;
        float f3 = this.a.b;
        float f4 = this.b.b;
        float f5 = 1.0f / ((f * f4) - (f2 * f3));
        this.a.f60a = f5 * f4;
        this.b.f60a = (-f5) * f2;
        this.a.b = (-f5) * f3;
        this.b.b = f5 * f;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        stringBuffer.append(this.a.f60a);
        stringBuffer.append(',');
        stringBuffer.append(this.b.f60a);
        stringBuffer.append('|');
        stringBuffer.append(this.a.b);
        stringBuffer.append(',');
        stringBuffer.append(this.b.b);
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public static final void a(al alVar, ap apVar, ap apVar2) {
        float f = (alVar.a.b * apVar.f60a) + (alVar.b.b * apVar.b);
        apVar2.f60a = (alVar.a.f60a * apVar.f60a) + (alVar.b.f60a * apVar.b);
        apVar2.b = f;
    }

    public static final void b(al alVar, ap apVar, ap apVar2) {
        float f = (apVar.f60a * alVar.a.f60a) + (apVar.b * alVar.a.b);
        apVar2.b = (apVar.f60a * alVar.b.f60a) + (apVar.b * alVar.b.b);
        apVar2.f60a = f;
    }

    static {
        new w();
    }
}
