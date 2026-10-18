package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:es.class */
public final class es {
    public final ap a = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final al f327a = new al();

    public static final void a(es esVar, ap apVar, ap apVar2) {
        float f = esVar.a.b + (esVar.f327a.a.b * apVar.f60a) + (esVar.f327a.b.b * apVar.b);
        apVar2.f60a = esVar.a.f60a + (esVar.f327a.a.f60a * apVar.f60a) + (esVar.f327a.b.f60a * apVar.b);
        apVar2.b = f;
    }

    public static final void b(es esVar, ap apVar, ap apVar2) {
        float f = apVar.f60a - esVar.a.f60a;
        float f2 = apVar.b - esVar.a.b;
        ap apVar3 = esVar.f327a.a;
        ap apVar4 = esVar.f327a.b;
        float f3 = (f * apVar4.f60a) + (f2 * apVar4.b);
        apVar2.f60a = (f * apVar3.f60a) + (f2 * apVar3.b);
        apVar2.b = f3;
    }

    public final String toString() {
        return new StringBuffer().append(new StringBuffer().append("XForm:\n").append("Position: ").append(this.a).append("\n").toString()).append("R: \n").append(this.f327a).append("\n").toString();
    }
}
