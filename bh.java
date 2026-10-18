package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:bh.class */
public final class bh {
    protected int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public Object f104a;
    int b;
    int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    boolean f105a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int[] f106a = new int[9];

    public final void a(bh bhVar) {
        this.a = bhVar.a;
        this.f104a = bhVar.f104a;
        this.b = bhVar.b;
        this.c = bhVar.c;
        this.f105a = bhVar.f105a;
        if (bhVar.f106a != null) {
            az.a(bhVar.f106a, 0, this.f106a, 0, bhVar.f106a.length);
        }
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.f106a[1] + this.f106a[5];
    }

    public final int c() {
        return this.f106a[2] + this.f106a[6];
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Fragment frag: [");
        stringBuffer.append(this.a);
        stringBuffer.append(", xy: ");
        stringBuffer.append(this.f106a[3]);
        stringBuffer.append(',');
        stringBuffer.append(this.f106a[4]);
        stringBuffer.append(", fsize: ");
        stringBuffer.append(b());
        stringBuffer.append(',');
        stringBuffer.append(c());
        stringBuffer.append(", offset: ");
        stringBuffer.append(this.f106a[7]);
        stringBuffer.append(',');
        stringBuffer.append(this.f106a[8]);
        stringBuffer.append(", size offset: ");
        stringBuffer.append(this.f106a[5]);
        stringBuffer.append(',');
        stringBuffer.append(this.f106a[6]);
        stringBuffer.append(", size: ");
        stringBuffer.append(this.f106a[1]);
        stringBuffer.append(',');
        stringBuffer.append(this.f106a[2]);
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
