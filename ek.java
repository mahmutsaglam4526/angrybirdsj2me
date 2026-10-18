package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ek.class */
public final class ek {
    public ej a;
    public ej b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private long f320a;

    public final void a(ej ejVar, ej ejVar2) {
        this.a = ejVar;
        this.b = ejVar2;
        this.f320a = (ejVar.f319a << 16) | ejVar2.f319a;
    }

    public static void a(ek[] ekVarArr, int r6, int r7) {
        while (r6 < r7) {
            int r8 = r6 + 1;
            int r9 = r7 - 1;
            ek ekVar = ekVarArr[r6];
            while (true) {
                if (r8 > r7 - 1 || ekVarArr[r8].f320a > ekVar.f320a) {
                    while (r9 > r6 && ekVarArr[r9].f320a > ekVar.f320a) {
                        r9--;
                    }
                    if (r8 < r9) {
                        ek ekVar2 = ekVarArr[r8];
                        ekVarArr[r8] = ekVarArr[r9];
                        ekVarArr[r9] = ekVar2;
                    }
                } else {
                    r8++;
                }
            }
            ekVarArr[r6] = ekVarArr[r9];
            ekVarArr[r9] = ekVar;
            a(ekVarArr, r6, r9);
            r6 = r9 + 1;
            ekVarArr = ekVarArr;
        }
    }
}
