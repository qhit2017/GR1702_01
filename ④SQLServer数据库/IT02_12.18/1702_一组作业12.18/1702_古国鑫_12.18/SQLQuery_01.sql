USE guguoxin
GO
/****** Object:  Table [dbo].[tb_student]    Script Date: 12/18/2017 19:52:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_student](
	[Sno] [char](11) NOT NULL,
	[Sname] [char](20) NOT NULL,
	[Ssex] [char](2) NULL,
	[Sage] [smallint] NOT NULL,
	[Sdpet] [char](2) NULL,
PRIMARY KEY CLUSTERED 
(
	[Sno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_SC]    Script Date: 12/18/2017 19:52:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_SC](
	[Sno] [char](11) NOT NULL,
	[Cno] [char](4) NULL,
	[Grade] [smallint] NULL,
PRIMARY KEY CLUSTERED 
(
	[Sno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_course]    Script Date: 12/18/2017 19:52:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_course](
	[Cno] [char](4) NOT NULL,
	[CName] [char](20) NULL,
	[Cpno] [char](4) NULL,
	[Ccredit] [smallint] NULL,
PRIMARY KEY CLUSTERED 
(
	[Cno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF__tb_student__Ssex__023D5A04]    Script Date: 12/18/2017 19:52:29 ******/
ALTER TABLE [dbo].[tb_student] ADD  DEFAULT ('ÄÐ') FOR [Ssex]
GO
/****** Object:  Check [CK__tb_student__Ssex__014935CB]    Script Date: 12/18/2017 19:52:29 ******/
ALTER TABLE [dbo].[tb_student]  WITH CHECK ADD CHECK  (([Ssex]='ÄÐ' OR [Ssex]='Å®'))
GO
