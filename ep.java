package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ep.class */
public final class ep {
    public static final float a(ap apVar, ap apVar2) {
        float f = apVar.f60a - apVar2.f60a;
        float f2 = apVar.b - apVar2.b;
        return (f * f) + (f2 * f2);
    }

    public static final float b(ap apVar, ap apVar2) {
        return (float) Math.sqrt(a(apVar, apVar2));
    }
}
