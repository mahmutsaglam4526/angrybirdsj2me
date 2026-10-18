package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ds.class */
public final class ds {
    public static boolean a(ev evVar, ev evVar2) {
        eu euVar = evVar.f338a;
        eu euVar2 = evVar2.f338a;
        if (euVar.c != euVar2.c || euVar.c == 0) {
            return ((euVar.b & euVar2.a) == 0 || (euVar.a & euVar2.b) == 0) ? false : true;
        }
        return euVar.c > 0;
    }
}
