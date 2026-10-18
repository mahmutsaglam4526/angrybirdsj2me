package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ex.class */
public final class ex {
    public du a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public am[] f343a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fe[] f344a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fq[] f345a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ey[] f346a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fa[] f347a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f348a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap f349a = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final fj f350a = new fj();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public final ap f351b = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final dt f352a = new dt();

    public final void a(ff[] ffVarArr) {
        if (this.a == null) {
            return;
        }
        for (int r7 = 0; r7 < this.c; r7++) {
            fe[] feVarArr = this.f344a;
            ff ffVar = ffVarArr[r7];
            for (int r9 = 0; r9 < ffVar.f372b; r9++) {
                this.f352a.a[r9] = ffVar.a[r9].f374a;
                this.f352a.b[r9] = ffVar.a[r9].f375b;
            }
            du duVar = this.a;
            dt dtVar = this.f352a;
        }
    }
}
