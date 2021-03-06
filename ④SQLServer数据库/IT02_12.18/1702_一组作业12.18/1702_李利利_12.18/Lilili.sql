USE [db_Lilili]
GO
/****** Object:  Table [dbo].[tb_Student]    Script Date: 12/18/2017 22:00:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_Student](
	[Sno] [char](11) NOT NULL,
	[Sname] [char](20) NOT NULL,
	[Ssex] [char](2) NOT NULL,
	[Sage] [smallint] NOT NULL,
	[Sdept] [char](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[Sno] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_SC]    Script Date: 12/18/2017 22:00:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_SC](
	[Sno] [char](11) NULL,
	[Cno] [char](4) NULL,
	[Grade] [smallint] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tb_Course]    Script Date: 12/18/2017 22:00:42 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_Course](
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
/****** Object:  Default [DF__tb_Student__Ssex__023D5A04]    Script Date: 12/18/2017 22:00:42 ******/
ALTER TABLE [dbo].[tb_Student] ADD  DEFAULT ('男') FOR [Ssex]
GO
/****** Object:  Check [CK__tb_Student__Ssex__014935CB]    Script Date: 12/18/2017 22:00:42 ******/
ALTER TABLE [dbo].[tb_Student]  WITH CHECK ADD CHECK  (([Ssex]='男' OR [Ssex]='女'))
GO
