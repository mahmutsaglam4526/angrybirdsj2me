package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:er.class */
public final class er {
    public final ap a = new ap();
    public final ap b = new ap();
    public final ap c = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f325a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public float f326b;

    public final String toString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("Sweep:\nlocalCenter: ").append(this.a).append("\n").toString()).append("c0: ").append(this.b).append(", c: ").append(this.c).append("\n").toString()).append("a0: ").append(this.f325a).append(", a: ").append(this.f326b).append("\n").toString();
    }

    public final void a() {
        float f = this.f325a / 6.2831855f;
        int r6 = (int) f;
        if (f < 0.0f && f != r6) {
            r6--;
        }
        float f2 = 6.2831855f * r6;
        this.f325a -= f2;
        this.f326b -= f2;
    }

    public final er a(er erVar) {
        this.a.a(erVar.a);
        this.b.a(erVar.b);
        this.c.a(erVar.c);
        this.f325a = erVar.f325a;
        this.f326b = erVar.f326b;
        return this;
    }

    public final void a(es esVar, float f) {
        esVar.a.f60a = ((1.0f - f) * this.b.f60a) + (f * this.c.f60a);
        esVar.a.b = ((1.0f - f) * this.b.b) + (f * this.c.b);
        esVar.f327a.a(((1.0f - f) * this.f325a) + (f * this.f326b));
        esVar.a.f60a -= (esVar.f327a.a.f60a * this.a.f60a) + (esVar.f327a.b.f60a * this.a.b);
        esVar.a.b -= (esVar.f327a.a.b * this.a.f60a) + (esVar.f327a.b.b * this.a.b);
    }
}
