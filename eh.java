package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:eh.class */
public final class eh implements dw {
    public final ei a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ej[] f304a;
    private int d;
    public int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ej f306a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f303a = 0;
    private int e = 16;
    public int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ek[] f305a = new ek[this.e];

    public eh() {
        for (int r6 = 0; r6 < this.e; r6++) {
            this.f305a[r6] = new ek();
        }
        this.d = 16;
        this.b = 0;
        this.f304a = new ej[this.d];
        this.a = new ei();
        this.f306a = null;
    }

    public final void a(ej ejVar) {
        if (this.b == this.d) {
            ej[] ejVarArr = this.f304a;
            this.d <<= 1;
            this.f304a = new ej[this.d];
            for (int r8 = 0; r8 < ejVarArr.length; r8++) {
                this.f304a[r8] = ejVarArr[r8];
            }
        }
        this.f304a[this.b] = ejVar;
        this.b++;
    }

    @Override // defpackage.dw
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean mo162a(ej ejVar) {
        if (ejVar == this.f306a) {
            return true;
        }
        if (this.c == this.e) {
            ek[] ekVarArr = this.f305a;
            this.e <<= 1;
            this.f305a = new ek[this.e];
            for (int r8 = 0; r8 < ekVarArr.length; r8++) {
                this.f305a[r8] = ekVarArr[r8];
            }
            for (int length = ekVarArr.length; length < this.e; length++) {
                this.f305a[length] = new ek();
            }
        }
        if (ejVar.f319a < this.f306a.f319a) {
            this.f305a[this.c].a(ejVar, this.f306a);
        } else {
            this.f305a[this.c].a(this.f306a, ejVar);
        }
        this.c++;
        return true;
    }
}
